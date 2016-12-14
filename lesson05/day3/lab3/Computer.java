package lesson5.day3.lab3;

public class Computer implements Cloneable {

    private String manufacturer;
    private String processor;
    private int ramSize;
    private int diskSize;
    private double processorSpeed;
    
    public Computer(String manufacturer, String processor, int ramSize, int diskSize, double cpuSpeed) {
        
        assert manufacturer != null;
        assert processor != null;
        
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = cpuSpeed;
    }
    
    public int getRamSize() {
        return ramSize;
    }
    
    int getDiskSize() {
        return diskSize;
    }
    
    double getProcessorSpeed() {
        return processorSpeed;
    }
    
    double computePower() {
        return ramSize * processorSpeed;
    }
    
    public void upgrade(String newCpu, int newRam, int newHdd, double newCpuSpeed) {
        processor = newCpu;
        ramSize = newRam;
        diskSize = newHdd;
        processorSpeed = newCpuSpeed;
    }
            
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" " + manufacturer);
        sb.append(" " + processor);
        sb.append(" " + processorSpeed + "GHz");
        sb.append(" RAM:" + ramSize + "GB");
        sb.append(" HDD:" + diskSize + "GB");
        return sb.toString();
    }
    
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Computer)) return false;
        
        Computer c = (Computer)obj;
        
        return  this.manufacturer.equals(c.manufacturer) &&
                this.processor.equals(c.processor) &&
                this.ramSize == c.ramSize &&
                this.diskSize == c.diskSize &&
                this.processorSpeed == c.processorSpeed;
    }
    
    public int hashCode() {
    
        int result = 5;

        result = 31 * result + manufacturer.hashCode();                 
        result = 31 * result + processor.hashCode();
        result = 31 * result + ramSize;
        result = 31 * result + diskSize;
        
        long doubleFieldBits = Double.doubleToLongBits(processorSpeed);
        result = 31 * result + (int)(doubleFieldBits ^ (doubleFieldBits >>> 32));

        return result;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 
}


