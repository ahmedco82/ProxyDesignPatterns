package com.ahmedco.proxy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmedco.proxy.test2.Image;
import com.ahmedco.proxy.test2.ProxyImage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test1();
        test2();
    }
    private void test2() {
          //https://www.tutorialspoint.com/design_pattern/proxy_pattern
        Image image = new ProxyImage("test_10mb.jpg");
        //image will be loaded from disk
        image.display();
        System.out.println("");
        //image will not be loaded from disk
        image.display();
    }
    private void test1() {
        // https://www.geeksforgeeks.org/proxy-design-pattern/
        Internet internet = new ProxyInternet();
        try{
            //internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
