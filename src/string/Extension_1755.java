package string;

import java.util.Scanner;

public class Extension_1755 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st = s.substring(s.indexOf("."));
        switch(st){
            case ".dib":
                System.out.print("Paint.Picture");
                break;
            case ".doc":
                System.out.print("Word.Document.8");
                break;
            case ".docx":
                System.out.print("Word.Document.12");
                break;
            case ".htm":
                System.out.print("htmfile");
                break;
            case ".html":
                System.out.print("htmfile");
                break;
            case ".hwp":
                System.out.print("Hwp.Document.96");
                break;
            case ".hwpx":
                System.out.print("Hwp.Document.hwpx.96");
                break;
            case ".hwt":
                System.out.print("Hwp.Document.hwt.96");
                break;
            case ".jpe":
                System.out.print("jpegfile");
                break;
            case ".jpeg":
                System.out.print("jpegfile");
                break;
            case ".jpg":
                System.out.print("jpegfile");
                break;
            case ".ppt":
                System.out.print("PowerPoint.Show.8");
                break;

            case ".pptx":
                System.out.print("PowerPoint.Show.12");
                break;

            case ".pptxml":
                System.out.print("Powerpointxmlfile");
                break;

        }
    }
}
