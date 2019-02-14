package com.example.springjni;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
public class JNIRestService {

    JNIWrapper w;

    public JNIRestService() {
        w = new JNIWrapper();
    }

    @RequestMapping(value = "/sum/{num1}/{num2}", method = RequestMethod.GET)
    public Integer sum(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        return w.sum(num1, num2);
    }

    @RequestMapping(value = "/img", method = RequestMethod.GET)
    public void img(HttpServletResponse response) throws IOException {
        InputStream in = JNIRestService.class.getClassLoader().getResourceAsStream("images/doge.jpg");
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        IOUtils.copy(in, response.getOutputStream());
    }
}