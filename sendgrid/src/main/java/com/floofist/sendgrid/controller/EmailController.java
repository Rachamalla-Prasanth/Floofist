package com.floofist.sendgrid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.floofist.sendgrid.model.EmailRequest;
import com.floofist.sendgrid.service.SendGridService;

@RestController
public class EmailController {

    @Autowired
    private SendGridService sendGridService;

    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {

        try {
            sendGridService.sendEmail(request.getTo(), request.getFrom(), request.getSubject(), request.getContent());
            return ResponseEntity.ok("Email sent successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error sending email: " + e.getMessage());
        }
    }
}
