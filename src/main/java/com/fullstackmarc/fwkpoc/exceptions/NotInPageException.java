package com.fullstackmarc.fwkpoc.exceptions;

import com.fullstackmarc.fwkpoc.selenium.pages.Page;

public class NotInPageException extends Exception {
    private Page page;

    public NotInPageException(Page page) {
        this.page = page;
    }

    @Override
    public String getMessage() {
        return "Page with title '" + this.page.getTitle() + "' is not what I expected.";
    }
}
