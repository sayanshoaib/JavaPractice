package com.shoaib.bazlur.chap8;

public class Datafetcher {

    public String fetchFromUrl(String url) throws CheckedException {
        if (url == null) {
            throw new CheckedException("Url not found");
        }
        String data = null;

        //rest of the statements
        //read lots of data over HTTP and return
        //it as a String instance.
        return data;
    }
}
