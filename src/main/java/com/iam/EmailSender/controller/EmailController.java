package com.iam.EmailSender.controller;


import com.iam.EmailSender.model.EmailDetails;
import com.iam.EmailSender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendMail(@RequestBody EmailDetails details){
        return emailService.sendMail(details);
    }

    @PostMapping("/Mailanexo")
    public String sendMailWithAttachment(@RequestBody EmailDetails details){
        return emailService.sendMailWithAttachment(details);
    }

}
