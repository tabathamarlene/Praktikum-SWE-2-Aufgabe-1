/* Praktikum zu Softwareentwicklung 2, SS24 
 * Aufgabe 1: 1 Git
 * Tabatha Tokar
 */

 public class Dozierender {
    // Attribute des Dozierenden
    private String name;
    private String fakultaet;
    private int bueronummer;

    // Konstruktor des Dozierenden
    public Dozierender(String name, String fakultaet, int bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }
    // Methode um Dozierenden eine frage beantworten zu lassen
    public void frageBeantworten(Studierender studierender, String antwort) {
        System.out.println(name + " beantwortet eine Frage von " + studierender.getName() + ": " + antwort);
    }
    // Methode um Dozierenden eine Sprechstundenanfrage empfangen zu lassen
    public void sprechstundenAnfrageEmpfangen(Studierender studierender, String termin, String grund) {
        System.out.println(name + " hat eine Sprechstundenanfrage von " + studierender.getName() + " erhalten für " + termin + " wegen: " + grund);
    }
    // Methode um Dozierenden ein Feedback verwalten zu lassen
    public void feedbackVerwalten(Studierender studierender, String feedback) {
        System.out.println(name + " gibt Feedback an " + studierender.getName() + ": " + feedback);
    }

    // Getter-Methoden für die Attribute des Dozierenden
    public String getName() {
        return name;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public int getBueronummer() {
        return bueronummer;
    }

}

    