**Insurance Business Network on Corda Blockchain**

This project introduces a blockchain-based network that streamlines the interaction between customers, insurance companies, service providers, and agents. It encapsulates a typical insurance claim process:

1. **Policy Selection**: Customers choose a policy and make the payment.
2. **Damage Reporting**: Customers can report damages to insured products.
3. **Claim Verification**: Insurance companies assign agents to verify damages, approve or deny claims based on their findings.
4. **Payment & Repair**: Once approved, the insurance company pays the care provider to repair the damage. In cases of irreparable damages, the customer gets a direct payout.

**Tech Highlights**:
- Developed in Java with Corda Blockchain Platform.
- Uses Intellij IDE, backed by Spring Boot & REST API.
- Offers a user-friendly website for customers.

**Core Components**:
1. **Smart Contracts**: Define rules for insurance claim transactions.
2. **States**: Represent the transaction details recorded on distributed ledgers.
3. **Workflows**: Detail the end-to-end insurance claim process.

🔗 **REST API Quick Guide**:
Use commands like `curl -i -X POST 'http://localhost:50005/create-iou?iouValue=12&partyName=O=PartyB,L=New%20York,C=US'` to interact with the backend. Explore endpoints like `/me`, `/peers`, and `/states` for node info and data.

A seamless integration of traditional insurance processes with the transparency and reliability of blockchain! 🚀🛡️
