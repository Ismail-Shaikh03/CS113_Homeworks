public class Book {
    private int pages;
    private String title;
    public Book (int pages,String title){
        this.pages=pages;
        this.title=title;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return "Book title is:"+title+" \nNumber of Pages:"+pages;
    }
    public boolean equals(Book other) {
        if(title== other.getTitle()){
            return true;
        }
        else{
            return false;
        }
    }
    public int compareTo(Book other) {
        if (pages < other.getPages()) {
            return -1;
        } else if (pages == other.getPages()) {
            return 0;
        } else{
            return 1;
        }
    }}
