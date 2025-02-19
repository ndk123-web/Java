// Create an array of Printable references of size 2.
// Assign a Document object to the first element and an Image object to the second element.
// Loop through the array and call the print method on each element.
// Use type casting to call the resize method on each element inside the loop.

import javax.print.Doc;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document");
    }

    void edit() {
        System.out.println("Editing document");
    }
}

class Image implements Printable {
    public void print() {
        System.out.println("Printing image");
    }

    void resize() {
        System.out.println("Resizing image");
    }
}

public class TypeCasting_3 {
    public static void main(String[] args) {

        Printable[] op = new Printable[2];

        Document document = new Document();
        Image image = new Image();

        op[0] = document;
        op[1] = image;

        for (int i = 0; i < op.length; i++) {
            op[i].print();
        }

        /*
         * for (Printable pr : op) {
         * pr.print();
         * 
         * if (pr instanceof Image) {   // Bhai Samaj ke le ab apne aap se
         * ((Image) pr).resize();       // ye ek keyword hai (instanceof) check krta hai 
         * }
         * 
         * if (pr instanceof Document) {
         * ((Document) pr).edit();
         * }
         * }
         */

        Document d = (Document) op[0];
        d.edit();

        Image i = (Image) op[1];
        i.resize();

    }
}
