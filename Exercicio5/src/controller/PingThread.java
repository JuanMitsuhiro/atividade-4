package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PingThread extends Thread{
	private String comando;
	private String nome;
	   
	public PingThread(String comando, String nome){
		this.comando = comando;
	 	this.nome = nome;
	}
	   
	private String os(){
		String os = System.getProperty("os.name");
		return os;
	}
	   
	@Override
	public void run(){
		String os = os();
		if (os.contains("Linux")){
	    	operacaoPing();
		} else{
	    	System.out.println("Sistema operacional inválido para esta operação");
		}      
	}
	   
	public void operacaoPing(){
		String comandoTotal = "ping -4 -c 10 "+ comando;
		String[] comandoArray = comandoTotal.split(" ");
	         
	 	try{
	    	Process p = Runtime.getRuntime().exec(comandoArray);
	    	InputStream fluxo = p.getInputStream();
	    	InputStreamReader leitor = new InputStreamReader(fluxo);
	    	BufferedReader buffer = new BufferedReader(leitor);
	    	String linha = buffer.readLine();
	    	while (linha != null){
	    		if (linha.contains("/")) {
	            	String[] linhaMedia = linha.split("/");	                    
	            	System.out.println("Servidor " + nome + ":\n Ping médio: " + 
	             	linhaMedia[4]);
	        	}
	            linha =  buffer.readLine();
	    	}
	            
	 	} catch (Exception e){
	    	System.err.println(e.getMessage());
	 	}
	}
}
