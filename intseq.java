package ajm;

import com.cycling74.max.Atom;

public class intseq extends numericseq {

	public intseq(Atom[] args) {
		super(args);
	}

	protected Atom[] coerceToNumber(Atom[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = Atom.newAtom(list[i].toInt());
		}
		return list;
	}

	protected Atom add(Atom n, Atom m) {
		return Atom.newAtom(n.toInt() + m.toInt());
	}

	protected Atom multiply(Atom n, Atom m) {
		return Atom.newAtom(n.toInt() * m.toInt());
	}
}
