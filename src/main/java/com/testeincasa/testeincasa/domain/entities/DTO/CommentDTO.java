package com.testeincasa.testeincasa.domain.entities.DTO;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {


    private static final long serialVersionUID = 5831536417516894581L;
    private String text;
    private Date date;
    private AuthorDTO authorDTO;

    public CommentDTO() {
    }

    public CommentDTO(String text, Date date, AuthorDTO authorDTO) {
        this.text = text;
        this.date = date;
        this.authorDTO = authorDTO;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthorDTO() {
        return authorDTO;
    }

    public void setAuthorDTO(AuthorDTO authorDTO) {
        this.authorDTO = authorDTO;
    }
}
