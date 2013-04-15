/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.util.Calendar;

/**
 *
 * @author ZavezX
 */
public class MembershipFee
{

    private int memberId;
    private int typeId;
    private Calendar invoiceSent;
    private Calendar paymentReceived;
    private boolean isPaid;

    public MembershipFee(int memberId, int typeId, Calendar invoiceSent, Calendar paymentReceived, boolean isPaid)
    {
        this.memberId = memberId;
        this.typeId = typeId;
        this.isPaid = isPaid;
        this.invoiceSent = invoiceSent;
        this.paymentReceived = paymentReceived;

    }

    public MembershipFee(MembershipFee mf)
    {
        this(mf.memberId, mf.typeId, mf.invoiceSent, mf.paymentReceived, mf.isPaid);
    }

    /**
     * @return the memberId
     */
    public int getMemberId()
    {
        return memberId;
    }

    /**
     * @return the typeId
     */
    public int getTypeId()
    {
        return typeId;
    }

    /**
     * @param typeId the typeId to set
     */
    public void setTypeId(int typeId)
    {
        this.typeId = typeId;
    }

    /**
     * @return the invoiceSent
     */
    public Calendar getInvoiceSent()
    {
        return invoiceSent;
    }

    /**
     * @param invoiceSent the invoiceSent to set
     */
    public void setInvoiceSent(Calendar invoiceSent)
    {
        this.invoiceSent = invoiceSent;
    }

    /**
     * @return the paymentReceived
     */
    public Calendar getPaymentReceived()
    {
        return paymentReceived;
    }

    /**
     * @param paymentReceived the paymentReceived to set
     */
    public void setPaymentReceived(Calendar paymentReceived)
    {
        this.paymentReceived = paymentReceived;
    }

    /**
     * @return the isPaid
     */
    public boolean isIsPaid()
    {
        return isPaid;
    }

    /**
     * @param isPaid the isPaid to set
     */
    public void setIsPaid(boolean isPaid)
    {
        this.isPaid = isPaid;
    }

}
