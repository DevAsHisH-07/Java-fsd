public class Product {
    private int pid;
    private String pname;
    private int pcost;

    public Product(int pid, String pname, int pcost) {
        this.pid = pid;
        this.pname = pname;
        this.pcost = pcost;
    }

    // Getter methods
    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public int getPcost() {
        return pcost;
    }
}
