package chapter02.array;

class Books {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].setTitle("Плоды Java");
        myBooks[1].setTitle("Java Гэтсби");
        myBooks[2].setTitle("Сборник рецептов по Java");

        myBooks[0].setAuthor("Боб");
        myBooks[1].setAuthor("Сью");
        myBooks[2].setAuthor("Ян");

        for (Books book:myBooks) {
            System.out.println(book.getTitle()+ ", автор "+book.getAuthor());
        }

    }
}
