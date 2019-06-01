package com.virtualpairprogrammers.isbntools;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.fail;


@RunWith(Arquillian.class)
public class ValidateISBNTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(ValidateISBN.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    ValidateISBN validator;

    @Test
    public void validate() throws Exception {
        String name = "Arquillian";
        Assert.assertEquals("Hello Arquillian!", validator.createValidation(name));
        validator.validate(System.out, name);
    }

    @Test
    public void test() {
    }
}
