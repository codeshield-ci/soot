/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AIdentNonvoidType extends PNonvoidType
{
    private TIdentifier _identifier_;
    private final LinkedList<PArrayBrackets> _arrayBrackets_ = new LinkedList<PArrayBrackets>();

    public AIdentNonvoidType()
    {
        // Constructor
    }

    public AIdentNonvoidType(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PArrayBrackets> _arrayBrackets_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setArrayBrackets(_arrayBrackets_);

    }

    @Override
    public Object clone()
    {
        return new AIdentNonvoidType(
            cloneNode(this._identifier_),
            cloneList(this._arrayBrackets_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentNonvoidType(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PArrayBrackets> getArrayBrackets()
    {
        return this._arrayBrackets_;
    }

    public void setArrayBrackets(List<PArrayBrackets> list)
    {
        this._arrayBrackets_.clear();
        this._arrayBrackets_.addAll(list);
        for(PArrayBrackets e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._arrayBrackets_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._arrayBrackets_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PArrayBrackets> i = this._arrayBrackets_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PArrayBrackets) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}