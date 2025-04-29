package blatt3;


import blatt3.a2.Email;
import blatt3.a2.Message;
import blatt3.a2.SMS;

public class Main {
    public static void main(String[] args) {

        Message m1 = new Email();
        Message m2 = new SMS();
        System.out.println(m1.getType ());
        System.out.println(m2.getType ());
    //m1.send();  Uncomment this line and explain what happens
        //Aufgabe 1:
/* public String owner: von überall sichtbar
private double balance: nur innerhalb der Klasse Account sichtbar
protected int pin: In allen Klassen im gleichen Package und in Unterklassen sichtbar
String internalNote: package-private ->Nur Klassen im selben Paket dürfen darauf zugreifen

Verbesserungen:
getBalance() (Getter methode also)
setPin() für Änderungen, wenn der aktuelle PIN korrekt eingegeben wurde


Aufgabe2:
1) Der statische Typ ist Message und der dynamische Typ ist Email (m1)
2) getType() aus Email wird aufgerufen
3)Weil m1 als Message deklariert wurde, kennt der Compiler nur die Methoden der Klasse Message.
 -> Compilerfehler
4) if (m1 instanceof Email) {
    ((Email) m1).send(); (so würde es gehen: man prüft erstmal, ob m1 ein Objekt von Email ist
    und wenn es true ist, dann wird "Email" gecastet und es kann ausgeführt werden)
}
 */
    }
}