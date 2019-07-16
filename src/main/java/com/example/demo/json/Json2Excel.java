package com.example.demo.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;
import java.util.Set;

/**
 * @auther le
 * @date 2019/6/20 17:30
 */
public class Json2Excel {


    public static void main(String[] args) throws IOException {
        toExcel("无角色用户");
        return;
    }

    private static void toExcel(String fileName) throws IOException {
        Set<String> keys = null;
        // 创建HSSFWorkbook对象
        HSSFWorkbook wb = new HSSFWorkbook();
        // 创建HSSFSheet对象
        HSSFSheet sheet = wb.createSheet("sheet0");
        File file = new File("C:\\Users\\wangj\\Desktop\\json\\"+fileName+".json");
        String str = FileUtils.readFileToString(file, "utf-8");
        JSONArray jsonArray = JSONObject.parseArray(str);
        // 创建HSSFRow对象
        HSSFRow row = sheet.createRow(0);
        // 创建HSSFCell对象
        if (keys == null) {
            //标题
            int roleNo = 0;
            for (Object o : jsonArray) {
                JSONObject jsonObject = (JSONObject) o;
                keys = jsonObject.keySet();
                row = sheet.createRow(roleNo++);
                int i = 0;
                for (String s : keys) {
                    HSSFCell cell = row.createCell(i++);
                    cell.setCellValue(jsonObject.getString(s));
                }
            }
        }
        // 输出Excel文件
        FileOutputStream output = new FileOutputStream("C:\\Users\\wangj\\Desktop\\json\\"+fileName+".xls");
        wb.write(output);
        output.flush();
        output.close();
    }
}
