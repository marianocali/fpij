package main.fpij.cap4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class newEx2 {

    final static List<Asset> assets = Arrays.asList(
            new Asset(Asset.AssetType.BOND, 1000),
            new Asset(Asset.AssetType.BOND, 2000),
            new Asset(Asset.AssetType.STOCK, 3000),
            new Asset(Asset.AssetType.STOCK, 4000)
    );

    public static int sumAssets(final Predicate<Asset> predicate){
        return assets.stream()
                .filter(predicate)
                .mapToInt(asset-> asset.getValue())
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("sum of all assets " + sumAssets(asset -> true));
        System.out.println("sum of stock assets " + sumAssets(asset -> asset.getType() == Asset.AssetType.STOCK));
    }
}
