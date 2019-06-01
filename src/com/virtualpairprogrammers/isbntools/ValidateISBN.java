package com.virtualpairprogrammers.isbntools;

import java.io.PrintStream;

class ValidateISBN {
    public void validate(PrintStream to, String name) {
        to.println(createValidation(name));
    }

    public String createValidation(String name) {
        return "Hello, " + name + "!";
    }
}

