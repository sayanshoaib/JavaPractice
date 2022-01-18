package com.shoaib.bazlur.chap3;

public class TableGenerator {
    public static void main(String[] args) {
        String table = """
                MasterDevSkills (PVT) LTD
                403, Chruch St, Toronto, ON, CA.
                        Customer INVOICE
                +---------------------------+--------------------------+
                |         Info              |       Customer           |
                +---------------------------+--------------------------+
                |     Software Engineer     |        Shoaib            |
                |         Gamer             |        Nur               |
                +---------------------------+--------------------------+
                """;

        System.out.println(table);
    }
}
