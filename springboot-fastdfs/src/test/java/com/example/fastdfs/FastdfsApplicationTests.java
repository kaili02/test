package com.example.fastdfs;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FastdfsApplicationTests {

    @Autowired
    FastFileStorageClient fastFileStorageClient;

    @Test
    public void contextLoads() throws IOException {
        File file = new File("D:\\sapjco3.jar");
        InputStream inputStream = new FileInputStream(file);
        // 流，大小，扩展名，元数据
        StorePath jar = fastFileStorageClient.uploadFile(inputStream, file.length(), "jar", null);
        System.out.println(jar.getGroup() + "---" + jar.getPath());
        System.out.println(jar.getFullPath());
//        File file2 = new File("D:\\sapjco4.jar");
//        OutputStream outputStream = new FileOutputStream(file2);
//        fastFileStorageClient.downloadFile("group1", "M00/00/00/wKgmgF6_hPuABhlQABUAnowEhY4390.jar", new DownloadFileStream(outputStream));
//        outputStream.close();

        fastFileStorageClient.deleteFile(jar.getFullPath());
//        fastFileStorageClient.deleteFile("group1","M00/00/00/wKgmgF7AC8GAIsxFABUAnowEhY4846.jar");
    }

}
