// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class APatternBinding  extends PatternBinding {
  public final Pattern pattern_;
  public final Expr expr_;
  public int line_num, col_num, offset;
  public APatternBinding(Pattern p1, Expr p2) { pattern_ = p1; expr_ = p2; }

  public <R,A> R accept(org.syntax.stella.Absyn.PatternBinding.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof org.syntax.stella.Absyn.APatternBinding) {
      org.syntax.stella.Absyn.APatternBinding x = (org.syntax.stella.Absyn.APatternBinding)o;
      return this.pattern_.equals(x.pattern_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.pattern_.hashCode())+this.expr_.hashCode();
  }


}
