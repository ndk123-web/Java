import java.util.*;

class Queuee {
    private int a[] = new int[10];
    private int rr, fr;

    public Queuee() {
        fr = 0;
        rr = -1;
    }

    public void enqueue(int ele) {
        if (rr == 9)
            System.out.print("QUEUE FULL");
        else {
            rr++;
            a[rr] = ele;
        }
    }

    public int dequeue() {
        int x;
        x = a[fr];
        fr++;
        return x;
    }

    public int top() {
        return a[fr];
    }

    public void display() {
        int i;
        for (i = fr; i <= rr; i++) {
            System.out.print(a[i] + "\t");
        }
    }

}

    public Q{
    public static void main(String args[]) {
        
    }
}



// <html>: Root element for the document.
// <head>: Contains metadata and links to resources.
// <title>: Sets the document’s title.
// <body>: Contains the visible content.
// <h1> to <h6>: Define headings (1 is largest, 6 is smallest).
// <p>: Defines a paragraph.
// <a>: Creates a hyperlink.
// <img>: Embeds an image.
// <b>: Makes text bold.
// <i>: Italicizes text.
// <strong>: Strongly emphasizes text (bold by default).
// <em>: Emphasizes text (italic by default).
// <ul>: Creates an unordered list.
// <ol>: Creates an ordered list.
// <li>: Defines a list item.
// <table>: Creates a table.
// <tr>: Defines a row in a table.
// <th>: Defines a header cell in a table.
// <td>: Defines a data cell in a table.
// <form>: Defines a form for user input.
// <input>: Defines an input control.
// <button>: Defines a clickable button.
// <div>: Defines a division or section.
// <span>: Defines a span of text.
// <br>: Inserts a line break.
// <hr>: Creates a horizontal rule.