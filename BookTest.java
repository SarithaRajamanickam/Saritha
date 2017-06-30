package com.mycompany.app;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;

import java.util.Collection;


import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameter;

import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BookTest
{
public int id;
public String name;
public String author;
public String publisher;
public int quantity;

public BookTest(int id,String name,String author,String publisher,int quantity)
{
    this.id=id;
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    this.quantity=quantity;
}
public Boolean actual;
@Parameters
public static Collection <Object[]> data()
{
    Object[][] data = new Object[][]{{101,"www","anu","pp1",10},{102,"sss","banu","pp2",20},{103,"aaa","devi","pp3",30}};
    return Arrays.asList(data);
}
Book b=new Book();
@Test
public void libraryTest()
{
    actual=b.display(id,name,author,publisher,quantity);
    assertEquals("output",true,actual);

}


}