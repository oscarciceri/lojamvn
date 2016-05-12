package estoquistaPk;


public class estoquista  extends java.lang.Object implements java.lang.Cloneable  {

	
	public State state;
	public Boolean status;
	
	public estoquista()
	{
		state = State.mostrando;
		
	}
	
	public estoquista clone()
	{
		try {
			return (estoquista)super.clone();
		}
		catch(Exception e)
		{
			e.printStackTrace(java.lang.System.err);
		}
		return null;
	}
	

	public void handleEvent(Object... in_colObject)
	{
		if(in_colObject.length > 0)
		{
			String sEventName = (String)in_colObject[0];
			
			if((state == State.mostrando) && (sEventName.compareTo("inicializarEvent") == 0))
			{
				status = ((Boolean)in_colObject[1]).booleanValue();
	
			}
			
			else if((state == State.mostrando) && (sEventName.compareTo("cadastrarEvent") == 0))
			{		
				if (cadastrar()) {
					state = State.cadastrando;
				} else {
					state = State.mostrando;
				}
			}
			
			
			else if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroEvent") == 0))
			{		
				if (fazerCadastro()) {
					state = State.mostrando;
				} else {
					state = State.cadastrando;
				}
			}
			
			else if((state == State.mostrando) && (sEventName.compareTo("alterarEvent") == 0))
			{		
				if (alterar()) {
					state = State.alterando;
				} else {
					state = State.mostrando;
				}
			}
			
			
			else if((state == State.alterando) && (sEventName.compareTo("fazerAlteraçoesEvent") == 0))
			{		
				if (fazerAlteraçoes()) {
					state = State.mostrando;
				} else {
					state = State.alterando;
				}
			}
			
			
			else if((state == State.mostrando) && (sEventName.compareTo("desativarEvent") == 0))
			{		
				if (desativar()) {
					state = State.desactivando;
				} else {
					state = State.mostrando;
				}
			}
			
			
			else if((state == State.desactivando) && (sEventName.compareTo("fazerDesactivaçãoEvent") == 0))
			{		
				if (fazerDesactivação()) {
					state = State.mostrando;
				} else {
					state = State.desactivando;
				}
			}
			
			
			
			
			}
		}
	
	
	public Boolean cadastrar()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean fazerAlteraçoes()
	{
		if (status == true)
		return true;
		else
		return false;
		//return adaptador.activado();
	}
	
	public Boolean alterar()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean fazerCadastro()
	{
		if (status == true)
		return true;
		else
		return false;
		//return adaptador.activado();
	}
	
	public Boolean desativar()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean fazerDesactivação()
	{
		if (status == true)
		return true;
		else
		return false;
		//return adaptador.activado();
	}
	
	
	
	
	
}
