package com.shoaib.bazlur.chap8;

public class DataFetcherDemo {
//    public void fetchData() {
//        Datafetcher datafetcher = new Datafetcher();
//        String url = "https://google.com";
//
//        try{
//            datafetcher.fetchFromUrl(url);
//        } catch (CheckedException e) {
//            e.printStackTrace();
//            System.out.println("Unable to fetch data");
//        }
//    }

    public void fetchData() throws CheckedException {
        Datafetcher datafetcher = new Datafetcher();
        String url = "https://google.com";

        datafetcher.fetchFromUrl(url);
    }
}
