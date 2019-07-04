package com.example.demo.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * @auther le
 * @date 2019/7/3 13:32
 */
public class NameScannerProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (!roundEnv.processingOver()) {
            for (Element element : roundEnv.getElementsAnnotatedWith(NameScanner.class)) {
                String name = element.getSimpleName().toString();
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "element name: " + name);
            }
        }
        return false;
    }
}
