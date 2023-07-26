package net.corda.samples.example.states;

import net.corda.core.contracts.ContractState;
import net.corda.samples.example.contracts.PaymentContract;

import net.corda.core.contracts.BelongsToContract;
import net.corda.core.contracts.LinearState;
import net.corda.core.contracts.UniqueIdentifier;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;

import java.util.Arrays;
import java.util.List;

/**
 * The states object recording IOU agreements between two parties.
 *
 * A states must implement [ContractState] or one of its descendants.
 */
@BelongsToContract(PaymentContract.class)
public class PaymentState implements LinearState, ContractState {
    private final Integer amount;
    private final Party sender;
    private final Party receiver;
    private final UniqueIdentifier linearId;

    /**
     * @param amount the value of the IOU.
     * @param sender the party issuing the IOU.
     * @param receiver the party receiving and approving the IOU.
     * @param linearId the unique identifier of the IOU state.
     */
    public PaymentState(Integer amount,
                        Party sender,
                        Party receiver,
                        UniqueIdentifier linearId)
    {
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.linearId = linearId;
    }

    public Integer getAmount() { return amount; }
    public Party getSender() { return sender; }
    public Party getReceiver() { return receiver; }
    @Override public UniqueIdentifier getLinearId() { return linearId; }
    @Override public List<AbstractParty> getParticipants() {
        return Arrays.asList(sender, receiver);
    }





    @Override
    public String toString() {
        return String.format("PaymentState(value=%s, lender=%s, borrower=%s, linearId=%s)", amount, sender, receiver, linearId);
    }
}