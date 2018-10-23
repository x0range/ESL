package org.economicsl.contract.obligation;

import org.economicsl.agent.Agent;
import org.economicsl.inventory.Item;

/**
 * The Obligation class is the org message sent from Contracts requesting the
 * manipulation of balancesheets. It defines what item should be moved from one
 * balancesheet to another.
 * 
 * @author prauwolf
 *
 */
public class Obligation {

    // The org.economicsl.agent who will receive the item.
    private Agent to;

    // The org.economicsl.agent offering the item.
    private Agent from;

    // The item being transferred.
    private Item what;

    public Obligation(Agent to, Agent from, Item what) {
	this.to = to;
	this.from = from;
	this.what = what;
    }

    public Agent getTo() {
	return to;
    }

    public Agent getFrom() {
	return from;
    }

    public Item getWhat() {
	return what;
    }

}
