public class Q80 {
    int fvar;
    static int cvar;

    public static void main(String[] args) {
        Q80 t = new Q80();
        // insert cod e here to write field variables

        // OK
        t.fvar = 200;

        // OK
        cvar = 400;

        // NOT OK, because fvar not linked to any instance
        // fvar=200; cvar=400;

        // NOT OK, because can not refer this from a static method
        // this.fvar = 200; this.cvar = 400;

        // OK
        t.fvar = 200; Q80.cvar = 400;

        // NOT OK, because can not refer this from a static method
        // this.fvar = 200; Q80.cvar = 400;
    }
}
