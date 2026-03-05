// package com.yf;
//
// import com.yf.controllers.HelloController;
// import org.springframework.boot.context.TypeExcludeFilter;
// import org.springframework.core.type.classreading.MetadataReader;
// import org.springframework.core.type.classreading.MetadataReaderFactory;
//
// public class MyTypeExcludeFilter extends TypeExcludeFilter {
//
//
//     public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory){
//         if(metadataReader.getClassMetadata().getClass() == HelloController.class){
//             return true;
//         }
//         return false;
//     }
// }
