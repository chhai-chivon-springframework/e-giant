package com.giant.egiant.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author by chhai.chivon  on 11/30/2017.
 */
@RestController
public class UploadController {

    //https://hellokoding.com/uploading-multiple-files-example-with-spring-boot/
    public static final String uploadingdir = System.getProperty("user.dir") + "/uploadingdir/";

    @RequestMapping("/")
    public String uploading(Model model) {
        File file = new File(uploadingdir);
        model.addAttribute("files", file.listFiles());
        return "uploading";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String uploadingPost(@RequestParam("uploadingFiles") MultipartFile[] uploadingFiles) throws IOException {
        for(MultipartFile uploadedFile : uploadingFiles) {
            File file = new File(uploadingdir + uploadedFile.getOriginalFilename());
            uploadedFile.transferTo(file);
        }
        return "redirect:/";
    }
}
