package main.fpij.cap4;

public class Asset {
    public enum AssetType {BOND, STOCK};
    private final Asset.AssetType type;
    private final int value;

    public Asset(final Asset.AssetType assetType, final int assetValue){
        type = assetType;
        value = assetValue;
    }

    public AssetType getType(){
        return type;
    }

    public int getValue(){
        return value;
    }
}
