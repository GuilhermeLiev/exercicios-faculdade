public class Data {
    private int dia;
    private int mes;
    private int ano;



    public Data(int dia, int mes, int ano){

       this.dia = dia;
       this.mes = mes;
       this.ano = ano;
    }

    //GETTERS AND SETTERS
    public int getAno() {
        return ano;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString(){
        return "=== INFORMAÇÕES DATA ===\n" +
        "Dia: " + dia + "\n" +
        "Mês: " + mes + "\n" +
        "Ano: " + ano;
    }


}