package Kata3;

public class Kata3 {
    
    public static void main(String[] args) {
            MailReader mailReader = new MailReader("mails.txt");
    HistogramBuilder<String> builder = new HistogramBuilder<>();
    Histogram<String> histogram = builder.build(mailReader.realDomains());
    new HistogramViewer<String>().print(histogram);
    }
}


