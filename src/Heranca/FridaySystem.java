package heranca;
class Friday { // classe pai
	
	boolean ativo = false;

	public void comando() {
		
		System.out.println("F.R.I.D.A.Y., é a sua vez. Preparada?\nF.R.I.D.A.Y.: Para você, senhor? Sempre");
	}
}


class ModoCombate extends Friday {
	@Override
	public void comando() {
		super.comando();
		System.out.println("Ativar modo de combate\nF.R.I.D.A.Y.: Modo de combate ativado!");
	}
	public void combate() {
		System.out.println("Analise o padrão de luta dele!\nF.R.I.D.A.Y.:Escaneando... Padrão identificado.\nF.R.I.D.A.Y.: Sugestão: use os propulsores das pernas para ganhar vantagem aérea");
	}

	public void propulsores() {
		if (ativo) {
			System.out.println("F.R.I.D.A.Y: Propulsores ativados e prontos para uso!");
		} else {
			System.out.println("F.R.I.D.A.Y: Propulsores desativados, realizando análise de falha...");
		}
	}
}

class ControleSistema extends Friday {
	@Override
	public void comando() {
		ativo = true;
		System.out.println("Ativar Controle de Sistema F.R.I.D.A.Y\nF.R.I.D.A.Y: Entendido, Controle de Sistema ativado!");
	}
	public void alerta() {
		System.out.println("F.R.I.D.A.Y: Alerta: Oxigênio em níveis críticos. Iniciando protocolo de emergência...");
	}
	public void defesa() {
		System.out.println("Iniciar reparos de emergência!\nF.R.I.D.A.Y.: Iniciando reparo de emergência com nanobots.");
	}
}
class Reparacao {
	@Deprecated
	public void deploy() {
		System.out.println("F.R.I.D.A.Y: Reparo sendo aplicado no traje. Descartando gerador de energia");
	}
	public void correcao() {
		System.out.println("Desempenho e reparos do traje ajustados com base em dados atualizados. Novo gerador de energia aplicada!");
	}
}

public class FridaySystem {
 	public static void main(String[] args) {

 	ModoCombate on = new ModoCombate();
		on.comando();
		on.ativo = true;
		on.propulsores();
		on.combate();

 	ControleSistema control = new ControleSistema();
		control.comando();
		control.alerta();
		control.defesa();

	Reparacao reparo = new Reparacao();
	reparo.correcao();
 	}
 }

