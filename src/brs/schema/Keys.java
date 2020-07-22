/*
 * This file is generated by jOOQ.
 */
package brs.schema;


import brs.schema.tables.*;
import brs.schema.tables.records.*;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>DB</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AccountRecord, Long> IDENTITY_ACCOUNT = Identities0.IDENTITY_ACCOUNT;
    public static final Identity<AccountAssetRecord, Long> IDENTITY_ACCOUNT_ASSET = Identities0.IDENTITY_ACCOUNT_ASSET;
    public static final Identity<AliasRecord, Long> IDENTITY_ALIAS = Identities0.IDENTITY_ALIAS;
    public static final Identity<AliasOfferRecord, Long> IDENTITY_ALIAS_OFFER = Identities0.IDENTITY_ALIAS_OFFER;
    public static final Identity<AskOrderRecord, Long> IDENTITY_ASK_ORDER = Identities0.IDENTITY_ASK_ORDER;
    public static final Identity<AssetRecord, Long> IDENTITY_ASSET = Identities0.IDENTITY_ASSET;
    public static final Identity<AssetTransferRecord, Long> IDENTITY_ASSET_TRANSFER = Identities0.IDENTITY_ASSET_TRANSFER;
    public static final Identity<AtRecord, Long> IDENTITY_AT = Identities0.IDENTITY_AT;
    public static final Identity<AtStateRecord, Long> IDENTITY_AT_STATE = Identities0.IDENTITY_AT_STATE;
    public static final Identity<BidOrderRecord, Long> IDENTITY_BID_ORDER = Identities0.IDENTITY_BID_ORDER;
    public static final Identity<BlockRecord, Long> IDENTITY_BLOCK = Identities0.IDENTITY_BLOCK;
    public static final Identity<EscrowRecord, Long> IDENTITY_ESCROW = Identities0.IDENTITY_ESCROW;
    public static final Identity<EscrowDecisionRecord, Long> IDENTITY_ESCROW_DECISION = Identities0.IDENTITY_ESCROW_DECISION;
    public static final Identity<GoodsRecord, Long> IDENTITY_GOODS = Identities0.IDENTITY_GOODS;
    public static final Identity<IndirectIncomingRecord, Long> IDENTITY_INDIRECT_INCOMING = Identities0.IDENTITY_INDIRECT_INCOMING;
    public static final Identity<PurchaseRecord, Long> IDENTITY_PURCHASE = Identities0.IDENTITY_PURCHASE;
    public static final Identity<PurchaseFeedbackRecord, Long> IDENTITY_PURCHASE_FEEDBACK = Identities0.IDENTITY_PURCHASE_FEEDBACK;
    public static final Identity<PurchasePublicFeedbackRecord, Long> IDENTITY_PURCHASE_PUBLIC_FEEDBACK = Identities0.IDENTITY_PURCHASE_PUBLIC_FEEDBACK;
    public static final Identity<RewardRecipAssignRecord, Long> IDENTITY_REWARD_RECIP_ASSIGN = Identities0.IDENTITY_REWARD_RECIP_ASSIGN;
    public static final Identity<SubscriptionRecord, Long> IDENTITY_SUBSCRIPTION = Identities0.IDENTITY_SUBSCRIPTION;
    public static final Identity<TradeRecord, Long> IDENTITY_TRADE = Identities0.IDENTITY_TRADE;
    public static final Identity<TransactionRecord, Long> IDENTITY_TRANSACTION = Identities0.IDENTITY_TRANSACTION;
    public static final Identity<UnconfirmedTransactionRecord, Long> IDENTITY_UNCONFIRMED_TRANSACTION = Identities0.IDENTITY_UNCONFIRMED_TRANSACTION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> KEY_ACCOUNT_PRIMARY = UniqueKeys0.KEY_ACCOUNT_PRIMARY;
    public static final UniqueKey<AccountRecord> KEY_ACCOUNT_ACCOUNT_ID_HEIGHT_IDX = UniqueKeys0.KEY_ACCOUNT_ACCOUNT_ID_HEIGHT_IDX;
    public static final UniqueKey<AccountAssetRecord> KEY_ACCOUNT_ASSET_PRIMARY = UniqueKeys0.KEY_ACCOUNT_ASSET_PRIMARY;
    public static final UniqueKey<AccountAssetRecord> KEY_ACCOUNT_ASSET_ACCOUNT_ASSET_ID_HEIGHT_IDX = UniqueKeys0.KEY_ACCOUNT_ASSET_ACCOUNT_ASSET_ID_HEIGHT_IDX;
    public static final UniqueKey<AliasRecord> KEY_ALIAS_PRIMARY = UniqueKeys0.KEY_ALIAS_PRIMARY;
    public static final UniqueKey<AliasRecord> KEY_ALIAS_ALIAS_ID_HEIGHT_IDX = UniqueKeys0.KEY_ALIAS_ALIAS_ID_HEIGHT_IDX;
    public static final UniqueKey<AliasOfferRecord> KEY_ALIAS_OFFER_PRIMARY = UniqueKeys0.KEY_ALIAS_OFFER_PRIMARY;
    public static final UniqueKey<AliasOfferRecord> KEY_ALIAS_OFFER_ALIAS_OFFER_ID_HEIGHT_IDX = UniqueKeys0.KEY_ALIAS_OFFER_ALIAS_OFFER_ID_HEIGHT_IDX;
    public static final UniqueKey<AskOrderRecord> KEY_ASK_ORDER_PRIMARY = UniqueKeys0.KEY_ASK_ORDER_PRIMARY;
    public static final UniqueKey<AskOrderRecord> KEY_ASK_ORDER_ASK_ORDER_ID_HEIGHT_IDX = UniqueKeys0.KEY_ASK_ORDER_ASK_ORDER_ID_HEIGHT_IDX;
    public static final UniqueKey<AssetRecord> KEY_ASSET_PRIMARY = UniqueKeys0.KEY_ASSET_PRIMARY;
    public static final UniqueKey<AssetRecord> KEY_ASSET_ASSET_ID_IDX = UniqueKeys0.KEY_ASSET_ASSET_ID_IDX;
    public static final UniqueKey<AssetTransferRecord> KEY_ASSET_TRANSFER_PRIMARY = UniqueKeys0.KEY_ASSET_TRANSFER_PRIMARY;
    public static final UniqueKey<AssetTransferRecord> KEY_ASSET_TRANSFER_ASSET_TRANSFER_ID_IDX = UniqueKeys0.KEY_ASSET_TRANSFER_ASSET_TRANSFER_ID_IDX;
    public static final UniqueKey<AtRecord> KEY_AT_PRIMARY = UniqueKeys0.KEY_AT_PRIMARY;
    public static final UniqueKey<AtRecord> KEY_AT_AT_ID_HEIGHT_IDX = UniqueKeys0.KEY_AT_AT_ID_HEIGHT_IDX;
    public static final UniqueKey<AtStateRecord> KEY_AT_STATE_PRIMARY = UniqueKeys0.KEY_AT_STATE_PRIMARY;
    public static final UniqueKey<AtStateRecord> KEY_AT_STATE_AT_STATE_AT_ID_HEIGHT_IDX = UniqueKeys0.KEY_AT_STATE_AT_STATE_AT_ID_HEIGHT_IDX;
    public static final UniqueKey<BidOrderRecord> KEY_BID_ORDER_PRIMARY = UniqueKeys0.KEY_BID_ORDER_PRIMARY;
    public static final UniqueKey<BidOrderRecord> KEY_BID_ORDER_BID_ORDER_ID_HEIGHT_IDX = UniqueKeys0.KEY_BID_ORDER_BID_ORDER_ID_HEIGHT_IDX;
    public static final UniqueKey<BlockRecord> KEY_BLOCK_PRIMARY = UniqueKeys0.KEY_BLOCK_PRIMARY;
    public static final UniqueKey<BlockRecord> KEY_BLOCK_BLOCK_ID_IDX = UniqueKeys0.KEY_BLOCK_BLOCK_ID_IDX;
    public static final UniqueKey<BlockRecord> KEY_BLOCK_BLOCK_TIMESTAMP_IDX = UniqueKeys0.KEY_BLOCK_BLOCK_TIMESTAMP_IDX;
    public static final UniqueKey<BlockRecord> KEY_BLOCK_BLOCK_HEIGHT_IDX = UniqueKeys0.KEY_BLOCK_BLOCK_HEIGHT_IDX;
    public static final UniqueKey<EscrowRecord> KEY_ESCROW_PRIMARY = UniqueKeys0.KEY_ESCROW_PRIMARY;
    public static final UniqueKey<EscrowRecord> KEY_ESCROW_ESCROW_ID_HEIGHT_IDX = UniqueKeys0.KEY_ESCROW_ESCROW_ID_HEIGHT_IDX;
    public static final UniqueKey<EscrowDecisionRecord> KEY_ESCROW_DECISION_PRIMARY = UniqueKeys0.KEY_ESCROW_DECISION_PRIMARY;
    public static final UniqueKey<EscrowDecisionRecord> KEY_ESCROW_DECISION_ESCROW_DECISION_ESCROW_ID_ACCOUNT_ID_HEIGHT_IDX = UniqueKeys0.KEY_ESCROW_DECISION_ESCROW_DECISION_ESCROW_ID_ACCOUNT_ID_HEIGHT_IDX;
    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = UniqueKeys0.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final UniqueKey<GoodsRecord> KEY_GOODS_PRIMARY = UniqueKeys0.KEY_GOODS_PRIMARY;
    public static final UniqueKey<GoodsRecord> KEY_GOODS_GOODS_ID_HEIGHT_IDX = UniqueKeys0.KEY_GOODS_GOODS_ID_HEIGHT_IDX;
    public static final UniqueKey<IndirectIncomingRecord> KEY_INDIRECT_INCOMING_PRIMARY = UniqueKeys0.KEY_INDIRECT_INCOMING_PRIMARY;
    public static final UniqueKey<IndirectIncomingRecord> KEY_INDIRECT_INCOMING_INDIRECT_INCOMING_DB_ID_UINDEX = UniqueKeys0.KEY_INDIRECT_INCOMING_INDIRECT_INCOMING_DB_ID_UINDEX;
    public static final UniqueKey<PeerRecord> KEY_PEER_PRIMARY = UniqueKeys0.KEY_PEER_PRIMARY;
    public static final UniqueKey<PurchaseRecord> KEY_PURCHASE_PRIMARY = UniqueKeys0.KEY_PURCHASE_PRIMARY;
    public static final UniqueKey<PurchaseRecord> KEY_PURCHASE_PURCHASE_ID_HEIGHT_IDX = UniqueKeys0.KEY_PURCHASE_PURCHASE_ID_HEIGHT_IDX;
    public static final UniqueKey<PurchaseFeedbackRecord> KEY_PURCHASE_FEEDBACK_PRIMARY = UniqueKeys0.KEY_PURCHASE_FEEDBACK_PRIMARY;
    public static final UniqueKey<PurchasePublicFeedbackRecord> KEY_PURCHASE_PUBLIC_FEEDBACK_PRIMARY = UniqueKeys0.KEY_PURCHASE_PUBLIC_FEEDBACK_PRIMARY;
    public static final UniqueKey<RewardRecipAssignRecord> KEY_REWARD_RECIP_ASSIGN_PRIMARY = UniqueKeys0.KEY_REWARD_RECIP_ASSIGN_PRIMARY;
    public static final UniqueKey<RewardRecipAssignRecord> KEY_REWARD_RECIP_ASSIGN_REWARD_RECIP_ASSIGN_ACCOUNT_ID_HEIGHT_IDX = UniqueKeys0.KEY_REWARD_RECIP_ASSIGN_REWARD_RECIP_ASSIGN_ACCOUNT_ID_HEIGHT_IDX;
    public static final UniqueKey<SubscriptionRecord> KEY_SUBSCRIPTION_PRIMARY = UniqueKeys0.KEY_SUBSCRIPTION_PRIMARY;
    public static final UniqueKey<SubscriptionRecord> KEY_SUBSCRIPTION_SUBSCRIPTION_ID_HEIGHT_IDX = UniqueKeys0.KEY_SUBSCRIPTION_SUBSCRIPTION_ID_HEIGHT_IDX;
    public static final UniqueKey<TradeRecord> KEY_TRADE_PRIMARY = UniqueKeys0.KEY_TRADE_PRIMARY;
    public static final UniqueKey<TradeRecord> KEY_TRADE_TRADE_ASK_BID_IDX = UniqueKeys0.KEY_TRADE_TRADE_ASK_BID_IDX;
    public static final UniqueKey<TransactionRecord> KEY_TRANSACTION_PRIMARY = UniqueKeys0.KEY_TRANSACTION_PRIMARY;
    public static final UniqueKey<TransactionRecord> KEY_TRANSACTION_TRANSACTION_ID_IDX = UniqueKeys0.KEY_TRANSACTION_TRANSACTION_ID_IDX;
    public static final UniqueKey<TransactionRecord> KEY_TRANSACTION_TRANSACTION_FULL_HASH_IDX = UniqueKeys0.KEY_TRANSACTION_TRANSACTION_FULL_HASH_IDX;
    public static final UniqueKey<UnconfirmedTransactionRecord> KEY_UNCONFIRMED_TRANSACTION_PRIMARY = UniqueKeys0.KEY_UNCONFIRMED_TRANSACTION_PRIMARY;
    public static final UniqueKey<UnconfirmedTransactionRecord> KEY_UNCONFIRMED_TRANSACTION_UNCONFIRMED_TRANSACTION_ID_IDX = UniqueKeys0.KEY_UNCONFIRMED_TRANSACTION_UNCONFIRMED_TRANSACTION_ID_IDX;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BlockRecord, BlockRecord> CONSTRAINT_3C = ForeignKeys0.CONSTRAINT_3C;
    public static final ForeignKey<BlockRecord, BlockRecord> CONSTRAINT_3C5 = ForeignKeys0.CONSTRAINT_3C5;
    public static final ForeignKey<TransactionRecord, BlockRecord> CONSTRAINT_FF = ForeignKeys0.CONSTRAINT_FF;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AccountRecord, Long> IDENTITY_ACCOUNT = Internal.createIdentity(Account.ACCOUNT, Account.ACCOUNT.DB_ID);
        public static Identity<AccountAssetRecord, Long> IDENTITY_ACCOUNT_ASSET = Internal.createIdentity(AccountAsset.ACCOUNT_ASSET, AccountAsset.ACCOUNT_ASSET.DB_ID);
        public static Identity<AliasRecord, Long> IDENTITY_ALIAS = Internal.createIdentity(Alias.ALIAS, Alias.ALIAS.DB_ID);
        public static Identity<AliasOfferRecord, Long> IDENTITY_ALIAS_OFFER = Internal.createIdentity(AliasOffer.ALIAS_OFFER, AliasOffer.ALIAS_OFFER.DB_ID);
        public static Identity<AskOrderRecord, Long> IDENTITY_ASK_ORDER = Internal.createIdentity(AskOrder.ASK_ORDER, AskOrder.ASK_ORDER.DB_ID);
        public static Identity<AssetRecord, Long> IDENTITY_ASSET = Internal.createIdentity(Asset.ASSET, Asset.ASSET.DB_ID);
        public static Identity<AssetTransferRecord, Long> IDENTITY_ASSET_TRANSFER = Internal.createIdentity(AssetTransfer.ASSET_TRANSFER, AssetTransfer.ASSET_TRANSFER.DB_ID);
        public static Identity<AtRecord, Long> IDENTITY_AT = Internal.createIdentity(At.AT, At.AT.DB_ID);
        public static Identity<AtStateRecord, Long> IDENTITY_AT_STATE = Internal.createIdentity(AtState.AT_STATE, AtState.AT_STATE.DB_ID);
        public static Identity<BidOrderRecord, Long> IDENTITY_BID_ORDER = Internal.createIdentity(BidOrder.BID_ORDER, BidOrder.BID_ORDER.DB_ID);
        public static Identity<BlockRecord, Long> IDENTITY_BLOCK = Internal.createIdentity(Block.BLOCK, Block.BLOCK.DB_ID);
        public static Identity<EscrowRecord, Long> IDENTITY_ESCROW = Internal.createIdentity(Escrow.ESCROW, Escrow.ESCROW.DB_ID);
        public static Identity<EscrowDecisionRecord, Long> IDENTITY_ESCROW_DECISION = Internal.createIdentity(EscrowDecision.ESCROW_DECISION, EscrowDecision.ESCROW_DECISION.DB_ID);
        public static Identity<GoodsRecord, Long> IDENTITY_GOODS = Internal.createIdentity(Goods.GOODS, Goods.GOODS.DB_ID);
        public static Identity<IndirectIncomingRecord, Long> IDENTITY_INDIRECT_INCOMING = Internal.createIdentity(IndirectIncoming.INDIRECT_INCOMING, IndirectIncoming.INDIRECT_INCOMING.DB_ID);
        public static Identity<PurchaseRecord, Long> IDENTITY_PURCHASE = Internal.createIdentity(Purchase.PURCHASE, Purchase.PURCHASE.DB_ID);
        public static Identity<PurchaseFeedbackRecord, Long> IDENTITY_PURCHASE_FEEDBACK = Internal.createIdentity(PurchaseFeedback.PURCHASE_FEEDBACK, PurchaseFeedback.PURCHASE_FEEDBACK.DB_ID);
        public static Identity<PurchasePublicFeedbackRecord, Long> IDENTITY_PURCHASE_PUBLIC_FEEDBACK = Internal.createIdentity(PurchasePublicFeedback.PURCHASE_PUBLIC_FEEDBACK, PurchasePublicFeedback.PURCHASE_PUBLIC_FEEDBACK.DB_ID);
        public static Identity<RewardRecipAssignRecord, Long> IDENTITY_REWARD_RECIP_ASSIGN = Internal.createIdentity(RewardRecipAssign.REWARD_RECIP_ASSIGN, RewardRecipAssign.REWARD_RECIP_ASSIGN.DB_ID);
        public static Identity<SubscriptionRecord, Long> IDENTITY_SUBSCRIPTION = Internal.createIdentity(Subscription.SUBSCRIPTION, Subscription.SUBSCRIPTION.DB_ID);
        public static Identity<TradeRecord, Long> IDENTITY_TRADE = Internal.createIdentity(Trade.TRADE, Trade.TRADE.DB_ID);
        public static Identity<TransactionRecord, Long> IDENTITY_TRANSACTION = Internal.createIdentity(Transaction.TRANSACTION, Transaction.TRANSACTION.DB_ID);
        public static Identity<UnconfirmedTransactionRecord, Long> IDENTITY_UNCONFIRMED_TRANSACTION = Internal.createIdentity(UnconfirmedTransaction.UNCONFIRMED_TRANSACTION, UnconfirmedTransaction.UNCONFIRMED_TRANSACTION.DB_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountRecord> KEY_ACCOUNT_PRIMARY = Internal.createUniqueKey(Account.ACCOUNT, "KEY_account_PRIMARY", Account.ACCOUNT.DB_ID);
        public static final UniqueKey<AccountRecord> KEY_ACCOUNT_ACCOUNT_ID_HEIGHT_IDX = Internal.createUniqueKey(Account.ACCOUNT, "KEY_account_account_id_height_idx", Account.ACCOUNT.ID, Account.ACCOUNT.HEIGHT);
        public static final UniqueKey<AccountAssetRecord> KEY_ACCOUNT_ASSET_PRIMARY = Internal.createUniqueKey(AccountAsset.ACCOUNT_ASSET, "KEY_account_asset_PRIMARY", AccountAsset.ACCOUNT_ASSET.DB_ID);
        public static final UniqueKey<AccountAssetRecord> KEY_ACCOUNT_ASSET_ACCOUNT_ASSET_ID_HEIGHT_IDX = Internal.createUniqueKey(AccountAsset.ACCOUNT_ASSET, "KEY_account_asset_account_asset_id_height_idx", AccountAsset.ACCOUNT_ASSET.ACCOUNT_ID, AccountAsset.ACCOUNT_ASSET.ASSET_ID, AccountAsset.ACCOUNT_ASSET.HEIGHT);
        public static final UniqueKey<AliasRecord> KEY_ALIAS_PRIMARY = Internal.createUniqueKey(Alias.ALIAS, "KEY_alias_PRIMARY", Alias.ALIAS.DB_ID);
        public static final UniqueKey<AliasRecord> KEY_ALIAS_ALIAS_ID_HEIGHT_IDX = Internal.createUniqueKey(Alias.ALIAS, "KEY_alias_alias_id_height_idx", Alias.ALIAS.ID, Alias.ALIAS.HEIGHT);
        public static final UniqueKey<AliasOfferRecord> KEY_ALIAS_OFFER_PRIMARY = Internal.createUniqueKey(AliasOffer.ALIAS_OFFER, "KEY_alias_offer_PRIMARY", AliasOffer.ALIAS_OFFER.DB_ID);
        public static final UniqueKey<AliasOfferRecord> KEY_ALIAS_OFFER_ALIAS_OFFER_ID_HEIGHT_IDX = Internal.createUniqueKey(AliasOffer.ALIAS_OFFER, "KEY_alias_offer_alias_offer_id_height_idx", AliasOffer.ALIAS_OFFER.ID, AliasOffer.ALIAS_OFFER.HEIGHT);
        public static final UniqueKey<AskOrderRecord> KEY_ASK_ORDER_PRIMARY = Internal.createUniqueKey(AskOrder.ASK_ORDER, "KEY_ask_order_PRIMARY", AskOrder.ASK_ORDER.DB_ID);
        public static final UniqueKey<AskOrderRecord> KEY_ASK_ORDER_ASK_ORDER_ID_HEIGHT_IDX = Internal.createUniqueKey(AskOrder.ASK_ORDER, "KEY_ask_order_ask_order_id_height_idx", AskOrder.ASK_ORDER.ID, AskOrder.ASK_ORDER.HEIGHT);
        public static final UniqueKey<AssetRecord> KEY_ASSET_PRIMARY = Internal.createUniqueKey(Asset.ASSET, "KEY_asset_PRIMARY", Asset.ASSET.DB_ID);
        public static final UniqueKey<AssetRecord> KEY_ASSET_ASSET_ID_IDX = Internal.createUniqueKey(Asset.ASSET, "KEY_asset_asset_id_idx", Asset.ASSET.ID);
        public static final UniqueKey<AssetTransferRecord> KEY_ASSET_TRANSFER_PRIMARY = Internal.createUniqueKey(AssetTransfer.ASSET_TRANSFER, "KEY_asset_transfer_PRIMARY", AssetTransfer.ASSET_TRANSFER.DB_ID);
        public static final UniqueKey<AssetTransferRecord> KEY_ASSET_TRANSFER_ASSET_TRANSFER_ID_IDX = Internal.createUniqueKey(AssetTransfer.ASSET_TRANSFER, "KEY_asset_transfer_asset_transfer_id_idx", AssetTransfer.ASSET_TRANSFER.ID);
        public static final UniqueKey<AtRecord> KEY_AT_PRIMARY = Internal.createUniqueKey(At.AT, "KEY_at_PRIMARY", At.AT.DB_ID);
        public static final UniqueKey<AtRecord> KEY_AT_AT_ID_HEIGHT_IDX = Internal.createUniqueKey(At.AT, "KEY_at_at_id_height_idx", At.AT.ID, At.AT.HEIGHT);
        public static final UniqueKey<AtStateRecord> KEY_AT_STATE_PRIMARY = Internal.createUniqueKey(AtState.AT_STATE, "KEY_at_state_PRIMARY", AtState.AT_STATE.DB_ID);
        public static final UniqueKey<AtStateRecord> KEY_AT_STATE_AT_STATE_AT_ID_HEIGHT_IDX = Internal.createUniqueKey(AtState.AT_STATE, "KEY_at_state_at_state_at_id_height_idx", AtState.AT_STATE.AT_ID, AtState.AT_STATE.HEIGHT);
        public static final UniqueKey<BidOrderRecord> KEY_BID_ORDER_PRIMARY = Internal.createUniqueKey(BidOrder.BID_ORDER, "KEY_bid_order_PRIMARY", BidOrder.BID_ORDER.DB_ID);
        public static final UniqueKey<BidOrderRecord> KEY_BID_ORDER_BID_ORDER_ID_HEIGHT_IDX = Internal.createUniqueKey(BidOrder.BID_ORDER, "KEY_bid_order_bid_order_id_height_idx", BidOrder.BID_ORDER.ID, BidOrder.BID_ORDER.HEIGHT);
        public static final UniqueKey<BlockRecord> KEY_BLOCK_PRIMARY = Internal.createUniqueKey(Block.BLOCK, "KEY_block_PRIMARY", Block.BLOCK.DB_ID);
        public static final UniqueKey<BlockRecord> KEY_BLOCK_BLOCK_ID_IDX = Internal.createUniqueKey(Block.BLOCK, "KEY_block_block_id_idx", Block.BLOCK.ID);
        public static final UniqueKey<BlockRecord> KEY_BLOCK_BLOCK_TIMESTAMP_IDX = Internal.createUniqueKey(Block.BLOCK, "KEY_block_block_timestamp_idx", Block.BLOCK.TIMESTAMP);
        public static final UniqueKey<BlockRecord> KEY_BLOCK_BLOCK_HEIGHT_IDX = Internal.createUniqueKey(Block.BLOCK, "KEY_block_block_height_idx", Block.BLOCK.HEIGHT);
        public static final UniqueKey<EscrowRecord> KEY_ESCROW_PRIMARY = Internal.createUniqueKey(Escrow.ESCROW, "KEY_escrow_PRIMARY", Escrow.ESCROW.DB_ID);
        public static final UniqueKey<EscrowRecord> KEY_ESCROW_ESCROW_ID_HEIGHT_IDX = Internal.createUniqueKey(Escrow.ESCROW, "KEY_escrow_escrow_id_height_idx", Escrow.ESCROW.ID, Escrow.ESCROW.HEIGHT);
        public static final UniqueKey<EscrowDecisionRecord> KEY_ESCROW_DECISION_PRIMARY = Internal.createUniqueKey(EscrowDecision.ESCROW_DECISION, "KEY_escrow_decision_PRIMARY", EscrowDecision.ESCROW_DECISION.DB_ID);
        public static final UniqueKey<EscrowDecisionRecord> KEY_ESCROW_DECISION_ESCROW_DECISION_ESCROW_ID_ACCOUNT_ID_HEIGHT_IDX = Internal.createUniqueKey(EscrowDecision.ESCROW_DECISION, "KEY_escrow_decision_escrow_decision_escrow_id_account_id_height_idx", EscrowDecision.ESCROW_DECISION.ESCROW_ID, EscrowDecision.ESCROW_DECISION.ACCOUNT_ID, EscrowDecision.ESCROW_DECISION.HEIGHT);
        public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "KEY_flyway_schema_history_PRIMARY", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<GoodsRecord> KEY_GOODS_PRIMARY = Internal.createUniqueKey(Goods.GOODS, "KEY_goods_PRIMARY", Goods.GOODS.DB_ID);
        public static final UniqueKey<GoodsRecord> KEY_GOODS_GOODS_ID_HEIGHT_IDX = Internal.createUniqueKey(Goods.GOODS, "KEY_goods_goods_id_height_idx", Goods.GOODS.ID, Goods.GOODS.HEIGHT);
        public static final UniqueKey<IndirectIncomingRecord> KEY_INDIRECT_INCOMING_PRIMARY = Internal.createUniqueKey(IndirectIncoming.INDIRECT_INCOMING, "KEY_indirect_incoming_PRIMARY", IndirectIncoming.INDIRECT_INCOMING.DB_ID);
        public static final UniqueKey<IndirectIncomingRecord> KEY_INDIRECT_INCOMING_INDIRECT_INCOMING_DB_ID_UINDEX = Internal.createUniqueKey(IndirectIncoming.INDIRECT_INCOMING, "KEY_indirect_incoming_indirect_incoming_db_id_uindex", IndirectIncoming.INDIRECT_INCOMING.ACCOUNT_ID, IndirectIncoming.INDIRECT_INCOMING.TRANSACTION_ID);
        public static final UniqueKey<PeerRecord> KEY_PEER_PRIMARY = Internal.createUniqueKey(Peer.PEER, "KEY_peer_PRIMARY", Peer.PEER.ADDRESS);
        public static final UniqueKey<PurchaseRecord> KEY_PURCHASE_PRIMARY = Internal.createUniqueKey(Purchase.PURCHASE, "KEY_purchase_PRIMARY", Purchase.PURCHASE.DB_ID);
        public static final UniqueKey<PurchaseRecord> KEY_PURCHASE_PURCHASE_ID_HEIGHT_IDX = Internal.createUniqueKey(Purchase.PURCHASE, "KEY_purchase_purchase_id_height_idx", Purchase.PURCHASE.ID, Purchase.PURCHASE.HEIGHT);
        public static final UniqueKey<PurchaseFeedbackRecord> KEY_PURCHASE_FEEDBACK_PRIMARY = Internal.createUniqueKey(PurchaseFeedback.PURCHASE_FEEDBACK, "KEY_purchase_feedback_PRIMARY", PurchaseFeedback.PURCHASE_FEEDBACK.DB_ID);
        public static final UniqueKey<PurchasePublicFeedbackRecord> KEY_PURCHASE_PUBLIC_FEEDBACK_PRIMARY = Internal.createUniqueKey(PurchasePublicFeedback.PURCHASE_PUBLIC_FEEDBACK, "KEY_purchase_public_feedback_PRIMARY", PurchasePublicFeedback.PURCHASE_PUBLIC_FEEDBACK.DB_ID);
        public static final UniqueKey<RewardRecipAssignRecord> KEY_REWARD_RECIP_ASSIGN_PRIMARY = Internal.createUniqueKey(RewardRecipAssign.REWARD_RECIP_ASSIGN, "KEY_reward_recip_assign_PRIMARY", RewardRecipAssign.REWARD_RECIP_ASSIGN.DB_ID);
        public static final UniqueKey<RewardRecipAssignRecord> KEY_REWARD_RECIP_ASSIGN_REWARD_RECIP_ASSIGN_ACCOUNT_ID_HEIGHT_IDX = Internal.createUniqueKey(RewardRecipAssign.REWARD_RECIP_ASSIGN, "KEY_reward_recip_assign_reward_recip_assign_account_id_height_idx", RewardRecipAssign.REWARD_RECIP_ASSIGN.ACCOUNT_ID, RewardRecipAssign.REWARD_RECIP_ASSIGN.HEIGHT);
        public static final UniqueKey<SubscriptionRecord> KEY_SUBSCRIPTION_PRIMARY = Internal.createUniqueKey(Subscription.SUBSCRIPTION, "KEY_subscription_PRIMARY", Subscription.SUBSCRIPTION.DB_ID);
        public static final UniqueKey<SubscriptionRecord> KEY_SUBSCRIPTION_SUBSCRIPTION_ID_HEIGHT_IDX = Internal.createUniqueKey(Subscription.SUBSCRIPTION, "KEY_subscription_subscription_id_height_idx", Subscription.SUBSCRIPTION.ID, Subscription.SUBSCRIPTION.HEIGHT);
        public static final UniqueKey<TradeRecord> KEY_TRADE_PRIMARY = Internal.createUniqueKey(Trade.TRADE, "KEY_trade_PRIMARY", Trade.TRADE.DB_ID);
        public static final UniqueKey<TradeRecord> KEY_TRADE_TRADE_ASK_BID_IDX = Internal.createUniqueKey(Trade.TRADE, "KEY_trade_trade_ask_bid_idx", Trade.TRADE.ASK_ORDER_ID, Trade.TRADE.BID_ORDER_ID);
        public static final UniqueKey<TransactionRecord> KEY_TRANSACTION_PRIMARY = Internal.createUniqueKey(Transaction.TRANSACTION, "KEY_transaction_PRIMARY", Transaction.TRANSACTION.DB_ID);
        public static final UniqueKey<TransactionRecord> KEY_TRANSACTION_TRANSACTION_ID_IDX = Internal.createUniqueKey(Transaction.TRANSACTION, "KEY_transaction_transaction_id_idx", Transaction.TRANSACTION.ID);
        public static final UniqueKey<TransactionRecord> KEY_TRANSACTION_TRANSACTION_FULL_HASH_IDX = Internal.createUniqueKey(Transaction.TRANSACTION, "KEY_transaction_transaction_full_hash_idx", Transaction.TRANSACTION.FULL_HASH);
        public static final UniqueKey<UnconfirmedTransactionRecord> KEY_UNCONFIRMED_TRANSACTION_PRIMARY = Internal.createUniqueKey(UnconfirmedTransaction.UNCONFIRMED_TRANSACTION, "KEY_unconfirmed_transaction_PRIMARY", UnconfirmedTransaction.UNCONFIRMED_TRANSACTION.DB_ID);
        public static final UniqueKey<UnconfirmedTransactionRecord> KEY_UNCONFIRMED_TRANSACTION_UNCONFIRMED_TRANSACTION_ID_IDX = Internal.createUniqueKey(UnconfirmedTransaction.UNCONFIRMED_TRANSACTION, "KEY_unconfirmed_transaction_unconfirmed_transaction_id_idx", UnconfirmedTransaction.UNCONFIRMED_TRANSACTION.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BlockRecord, BlockRecord> CONSTRAINT_3C = Internal.createForeignKey(brs.schema.Keys.KEY_BLOCK_BLOCK_ID_IDX, Block.BLOCK, "constraint_3c", Block.BLOCK.PREVIOUS_BLOCK_ID);
        public static final ForeignKey<BlockRecord, BlockRecord> CONSTRAINT_3C5 = Internal.createForeignKey(brs.schema.Keys.KEY_BLOCK_BLOCK_ID_IDX, Block.BLOCK, "constraint_3c5", Block.BLOCK.NEXT_BLOCK_ID);
        public static final ForeignKey<TransactionRecord, BlockRecord> CONSTRAINT_FF = Internal.createForeignKey(brs.schema.Keys.KEY_BLOCK_BLOCK_ID_IDX, Transaction.TRANSACTION, "constraint_ff", Transaction.TRANSACTION.BLOCK_ID);
    }
}
