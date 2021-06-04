package br.com.impacta.lab;

public class PessoaFisica implements Pessoa {

	public String documento;
	public String tipo;



    public PessoaFisica(String dc, String tp){
        this.documento = dc;
        this.tipo = tp;
    }


	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


    public String falarDocumento(){
        return "Documento: "+getDocumento();
    }

	

}
