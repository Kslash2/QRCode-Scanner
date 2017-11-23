# barcode-reader
This is a simple **Android App** that let you scan QRCodes using your camera. I needed an app for an UniversityProject with this functionality,
then I said ok, now I create a base version, maybe it can be useful for someone :)
I created this app just starting from [AndroidVision/VisionSamples/Barcode-Reader](https://github.com/googlesamples/android-vision/tree/master/visionSamples/barcode-reader).

### MainActivity.java
I deleted the 2 swtich, autofocus and flash, (just set autofocus true by default, while flash false by default).
I deleted the method onActivityResult, because this method would get the QRCodeResult and put into a texView(that I had deleted too)
into the main activity, but I didnt want this, I sent the result to another Activity called ResultActivity.

### BarcodeCaptureActivity.java
Here I changed a bunch of things. I deleted the intentGetExtra (autofocus and flash) because as I said before I decided to set them 
by default (by code), not using switches into the main activity, I didnt like this, C'mon you are trying to scan a QR you will always want Autofocus.
I added some code into the method onBarcodeDetected so when you capture the QRcode you don't have to do nothing, it will automatically
go on... What will it do? Just go using an Intent to another activity I created as I said before: Activity Result. So when the app scan for a QRCode, 
it automatically pass the QRCode as a String via Intent to ActivityResult, then it will put it in a TextView.

### colors.xml
I added some sets of colors taken from [MaterialPalette](https://www.materialpalette.com/) with the xml you can download, and just paste
the colors.

### themes.xml
Here I created some themes with the respective set of colors from colors.xml 

## License
I did this app for fun and because I need this as base for a project. I decided to publish this version because maybe it can be useful
and it could save time for someone!
The license is the same of the original that I modified ([AndroidVision/VisionSamples/Barcode-Reader](https://github.com/googlesamples/android-vision/tree/master/visionSamples/barcode-reader))

http://www.apache.org/licenses/LICENSE-2.0

Have fun! And if you see errors etc. Or just have any suggestions to improve this app, I would be really happy to hear from you.
