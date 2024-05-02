package main.fpij.cap4;

import java.util.Arrays;
import java.util.List;
import main.fpij.cap4.Asset.AssetType;

public class Ex1Asset {

    public static int totalAssetValues(final List<Asset> assets){
        return assets.stream()
                .mapToInt(Asset::getValue)
                .sum();
    }

    public static int totalBondAsset(final List<Asset> assets){
        return assets.stream()
                .mapToInt(asset->
                        asset.getType() == AssetType.BOND ? asset.getValue() : 0)
                .sum();
    }

    public static int totalStockAsset(final List<Asset> assets){
        return assets.stream()
                .mapToInt(asset -> asset.getType() == AssetType.STOCK ? asset.getValue() : 0)
                .sum();
    }

    public static void main(String[] args){
        final List<Asset> assets = Arrays.asList(
                new Asset(AssetType.BOND, 1000),
                new Asset(AssetType.BOND, 2000),
                new Asset(AssetType.STOCK, 3000),
                new Asset(AssetType.STOCK, 4000)
        );
        System.out.println("Total of all assets: " + totalAssetValues(assets));
        System.out.println("Total of all bond assets: " + totalBondAsset(assets));
        System.out.println("Total of all stock assets:" + totalStockAsset(assets));
    }

}





