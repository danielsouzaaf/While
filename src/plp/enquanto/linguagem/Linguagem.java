package plp.enquanto.linguagem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface Linguagem {
	final Map<String, Integer> ambiente = new HashMap<>();
	final Scanner scanner = new Scanner(System.in);

	interface Bool {
		public boolean getValor();
	}

	interface Comando {
		public void execute();
	}

	interface Expressao {
		public int getValor();
	}

	abstract class ExpBin implements Expressao {
		protected Expressao esq;
		protected Expressao dir;

		public ExpBin(Expressao esq, Expressao dir) {
			this.esq = esq;
			this.dir = dir;
		}
	}

	class Programa {
		private List<Comando> comandos;
		public Programa(List<Comando> comandos) {
			this.comandos = comandos;
		}
		public void execute() {
			for (Comando comando : comandos) {
				comando.execute();
			}
		}
	}

	class Se extends SenaoSe implements Comando {
		private Bool condicao;
		private Comando senao;
		private List<SenaoSe> listaSenaoSe;

		public Se(Bool condicao, Comando entao, List<SenaoSe> listaSenaoSe,Comando senao) {
			super(condicao, entao);

			this.listaSenaoSe = listaSenaoSe;
			this.senao = senao;
		}

		@Override
		public void execute() {
			boolean executaSenao = true;

			if (condicao.getValor()) {
				executaSenao = false;

				super.execute();
			} else {
				for (SenaoSe senaoSe : listaSenaoSe) {
					if (senaoSe.condicao.getValor()) {
						executaSenao = false;

						senaoSe.execute();
						break;
					}
				}
			}

			if (executaSenao) {
				senao.execute();
			}
		}
	}

	class SenaoSe implements Comando {
		private Bool condicao;
		private Comando entao;

		public SenaoSe(Bool condicao, Comando entao) {
			this.condicao = condicao;
			this.entao = entao;
		}

		@Override
		public void execute() {
			entao.execute();
		}
	}

	Skip skip = new Skip();
	class Skip implements Comando {
		@Override
		public void execute() {
		}
	}

	class Escreva implements Comando {
		private Expressao exp;

		public Escreva(Expressao exp) {
			this.exp = exp;
		}

		@Override
		public void execute() {
			System.out.println(exp.getValor());
		}
	}

	class Enquanto implements Comando {
		private Bool condicao;
		private Comando faca;

		public Enquanto(Bool condicao, Comando faca) {
			this.condicao = condicao;
			this.faca = faca;
		}

		@Override
		public void execute() {
			while (condicao.getValor()) {
				faca.execute();
			}
		}
	}

	class Exiba implements Comando {
		public Exiba(String texto) {
			this.texto = texto;
		}

		private String texto;

		@Override
		public void execute() {
			System.out.println(texto);
		}
	}

	class Bloco implements Comando {
		private List<Comando> comandos;

		public Bloco(List<Comando> comandos) {
			this.comandos = comandos;
		}

		@Override
		public void execute() {
			for (Comando comando : comandos) {
				comando.execute();
			}
		}
	}

	class Atribuicao implements Comando {
		private String id;
		private Expressao exp;

		public Atribuicao(String id, Expressao exp) {
			this.id = id;
			this.exp = exp;
		}

		@Override
		public void execute() {
			ambiente.put(id, exp.getValor());
		}
	}

	class Inteiro implements Expressao {
		private int valor;

		public Inteiro(int valor) {
			this.valor = valor;
		}

		@Override
		public int getValor() {
			return valor;
		}
	}

	class Id implements Expressao {
		private String id;

		public Id(String id) {
			this.id = id;
		}

		@Override
		public int getValor() {
			final Integer v = ambiente.get(id);
			final int valor;
			if (v != null)
				valor = v;
			else
				valor = 0;

			return valor;
		}
	}

	Leia leia = new Leia();
	class Leia implements Expressao {
		@Override
		public int getValor() {
			return scanner.nextInt();
		}
	}

	class ExpSoma extends ExpBin {
		public ExpSoma(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() + dir.getValor();
		}
	}

	class ExpSub extends ExpBin {
		public ExpSub(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() - dir.getValor();
		}
	}
	
	class ExpMult extends ExpBin {
		public ExpMult(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() * dir.getValor();
		}
	}

	class Booleano implements Bool {
		private boolean valor;

		public Booleano(boolean valor) {
			this.valor = valor;
		}

		@Override
		public boolean getValor() {
			return valor;
		}
	}

	abstract class ExpRel implements Bool {
		protected Expressao esq;
		protected Expressao dir;

		public ExpRel(Expressao esq, Expressao dir) {
			this.esq = esq;
			this.dir = dir;
		}
	}

	public class ExpIgual extends ExpRel {

		public ExpIgual(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() == dir.getValor();
		}

	}

	public class ExpMenorIgual extends ExpRel {
		public ExpMenorIgual(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() <= dir.getValor();
		}
	}

	public class ExpMaiorIgual extends ExpRel {
		public ExpMaiorIgual (Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() >= dir.getValor();
		}
	}

	public class ExpDiferente extends ExpRel {
		public ExpDiferente (Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() != dir.getValor();
		}
	}

	public class ExpMenor extends ExpRel {
		public ExpMenor (Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() < dir.getValor();
		}
	}

	public class ExpMaior extends ExpRel {
		public ExpMaior(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() > dir.getValor();
		}
	}

	public class NaoLogico implements Bool {
		private Bool b;

		public NaoLogico(Bool b) {
			this.b = b;
		}

		@Override
		public boolean getValor() {
			return !b.getValor();
		}
	}

	public class ELogico implements Bool {
		private Bool esq;
		private Bool dir;

		public ELogico(Bool esq, Bool dir) {
			this.esq = esq;
			this.dir = dir;
		}

		@Override
		public boolean getValor() {
			return esq.getValor() && dir.getValor();
		}
	}

	public class Laco implements Comando {
		private String id;
		private Expressao de;
		private Expressao ate;
		private Expressao passo;
		private List<Comando> comandos;

		public Laco(String id, Expressao de, Expressao ate, Expressao passo, List<Comando> comandos) {
			this.id = id;
			this.de = de;
			this.ate = ate;
			this.passo = passo;
			this.comandos = comandos;
		}

		@Override
		public void execute() {
			int de = this.de.getValor();
			int ate = this.ate.getValor();
			int passo = this.passo.getValor();
			for (int i = de; i < ate; i += passo ) {
				for (Comando comando : comandos) {
					comando.execute();
				}
				ambiente.put(this.id,  i);
			}
		}
	}

	class Escolha implements Comando {
		private String id;
		private List<Expressao> casos;
		private List<List<Comando>> comandos;

		public Escolha(String id, List<Expressao> casos, List<List<Comando>> comandos) {
			this.id = id;
			this.casos = casos;
			this.comandos = comandos;
		}

		@Override
		public void execute() {
			int valor = ambiente.get(this.id);
			int escolhido = 0;
			boolean executou = false;


			for (Expressao caso : this.casos) {
				if (valor == caso.getValor()) {
					List<Comando> cmds = this.comandos.get(escolhido);
					for (Comando cmd : cmds) {
						cmd.execute();
					}
					executou = true;
					return;
				}
				escolhido++;
			}

			List<Comando> cmds = this.comandos.get(this.comandos.size() - 1);
			for (Comando cmd : cmds) {
				cmd.execute();
			}
		}
	}

	class ExpDiv extends ExpBin {
		public ExpDiv(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() / dir.getValor();
		}
	}

	class ExpPot extends ExpBin {
		public ExpPot(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return (int) Math.pow((double) esq.getValor(), (double) dir.getValor());
		}
	}

	class OuLogico implements Bool {
		private Bool esq;
		private Bool dir;

		public OuLogico(Bool esq, Bool dir)
		{
			this.esq = esq;
			this.dir = dir;
		}

		@Override
		public boolean getValor() {
			return this.esq.getValor() || this.dir.getValor();
		}
	}

	class XorLogico implements Bool {
		private Bool esq;
		private Bool dir;

		public XorLogico(Bool esq, Bool dir)
		{
			this.esq = esq;
			this.dir = dir;
		}

		@Override
		public boolean getValor() {
			return this.esq.getValor() != this.dir.getValor();
		}
	}

	class Funcao {
		private String id;
		private Expressao retorno;

		private List<String> args;

		public Funcao(String id)
		{
			this.id = id;
		}

		public void setArgs(List<String> args) {
			this.args = args;
		}

		public void setRetorno(Expressao retorno) {
			this.retorno = retorno;
		}

		@Override
		public String toString()
		{
			StringBuilder buffer = new StringBuilder();
			String argDelim = "";

			for (String arg : args) {
				buffer.append(argDelim);
				buffer.append(arg);

				argDelim = ", ";
			}

			return String.format("%s(%s)", id, buffer.toString());
		}
	}

	class ChamadaFuncao implements Expressao {
		private Funcao funcao;
		private List<Expressao> params;

		public ChamadaFuncao(Funcao funcao, List<Expressao> params) {
			this.params = params;
			this.funcao = funcao;
		}

		@Override
		public int getValor() {
			for (int i = 0; i < funcao.args.size(); i++) {
				String id = funcao.args.get(i);

				ambiente.put(id, params.get(i).getValor());
			}

			return funcao.retorno.getValor();
		}
	}
}
