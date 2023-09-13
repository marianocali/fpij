package main.fpij.cap4;

import main.fpij.cap4.Asset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Ex2AssetSum {

    final static List<Asset> assets = Arrays.asList(
            new Asset(Asset.AssetType.BOND, 1000),
            new Asset(Asset.AssetType.BOND, 2000),
            new Asset(Asset.AssetType.STOCK, 3000),
            new Asset(Asset.AssetType.STOCK, 4000)
    );

    public static int totalAssetValues(final List<Asset> assets, Optional <Asset.AssetType> assetSelector){
        List<Asset> filterList = new ArrayList<>();
        if(assetSelector.isPresent()){
            for (Asset asset: assets) {
                if(asset.getType() == assetSelector.get()){
                    filterList.add(asset);
                }
            }
            return filterList.stream()
                    .mapToInt(Asset::getValue)
                    .sum();
        }else {
            return assets.stream()
                    .mapToInt(Asset::getValue)
                    .sum();
        }
    }


    public static int sumAssets(List<Asset> assets, final Predicate<Asset> assetSelector){
        return assets.stream()
                .filter(assetSelector)
                .mapToInt(asset -> asset.getValue())
                .sum();
    }

    public static void main(String[] args){
        Predicate<Asset> bondPredicate = asset-> asset.getType() == Asset.AssetType.BOND;
        Predicate<Asset> stockPredicate = asset-> asset.getType() == Asset.AssetType.STOCK;
        Asset asset = new Asset(Asset.AssetType.BOND, 1000);

        oldInvocation(assets);
        newInvocation(assets);
    }

    public static void oldInvocation(List<Asset> assets){

        System.out.println("oldInvocation");
        System.out.println("Total of all bond assets: " + totalAssetValues(assets, Optional.of(Asset.AssetType.BOND)));
        System.out.println("Total of all stock assets: " + totalAssetValues(assets, Optional.of(Asset.AssetType.STOCK)));
        System.out.println("Total of all assets: " + totalAssetValues(assets,Optional.ofNullable(null)));
    }

    public static void newInvocation(List<Asset> assets){
        System.out.println("newInvocation");
        Predicate<Asset> bondPredicate = asset-> asset.getType() == Asset.AssetType.BOND;
        Predicate<Asset> stockPredicate = asset-> asset.getType() == Asset.AssetType.STOCK;
        System.out.println("Total of all bond assets: " + sumAssets(assets, bondPredicate));
        System.out.println("Total of all stock assets: " + sumAssets(assets, stockPredicate));
        System.out.println("Total of all assets: " + sumAssets(assets, asset -> true));
    }


}
