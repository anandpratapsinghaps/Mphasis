package com.example.tags;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CurrentDates extends SimpleTagSupport {

    // Attribute for formatting date
    private String format;

    // Setter — must follow JavaBean rules
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        Date date = new Date();

        if (format != null) {
            DateFormat formatter = new SimpleDateFormat(format);
            out.println(formatter.format(date));
        } else {
            out.println(date.toString());
        }
    }
}
