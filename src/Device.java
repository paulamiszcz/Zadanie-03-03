class Device {
    String code;
    String producer;
    String type;
    double cena;

    public Device(String code, String producer, String type, double cena) {
        this(code,producer,type);
        this.cena = cena;
    }

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    String getInfo() {
        String result = "Kod: " + code + ", producent: " + producer + ", typ: " + type + ", cena: " + cena;
        return result;
    }
}
