package estoquistaPk;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases.class);
	}
	
	@Test
	public void test1()
	{
		estoquista oTestObject = new estoquista();
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("inicializarEvent", statusVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test2()
	{
		estoquista oTestObject = new estoquista();
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("inicializarEvent", statusVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteraçoesEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test3()
	{
		estoquista oTestObject = new estoquista();
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("inicializarEvent", statusVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("desativarEvent");
		assertEquals(true, (oTestObject.state == State.desactivando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("fazerDesactivaçãoEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
}