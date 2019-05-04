package com.coinomi.core.coins;


import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class SpectrumCashMain extends PeerFamily {
    private SpectrumCashMain() {
        id = "spectrumcash.main";

        addressHeader = 63;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 153;

        name = "SpectrumCash";
        symbol = "XSM";
        uriScheme = "spectrumcash";
        bip44Index = 360;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 LTC mininput
        softDustLimit = value(100000); // 0.001 LTC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("SpectrumCash Signed Message:\n");
    }

    private static SpectrumCashMain instance = new SpectrumCashMain();
    public static synchronized SpectrumCashMain get() {
        return instance;
    }
}
