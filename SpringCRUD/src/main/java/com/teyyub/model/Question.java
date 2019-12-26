package com.teyyub.model;

import java.util.Arrays;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author teyyub , 3:08:35 PM
 */
public class Question {
    private Integer id;
    private MultipartFile questionImage;
    private String cor_answer;
    private byte[] data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
    public MultipartFile getQuestionImage() {
        return questionImage;
    }

    public void setQuestionImage(MultipartFile questionImage) {
        this.questionImage = questionImage;
    }

    public String getCor_answer() {
        return cor_answer;
    }

    public void setCor_answer(String cor_answer) {
        this.cor_answer = cor_answer;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "["+
                " data "+ Arrays.toString(data)
                +"]";
    }
    
    
    
}
