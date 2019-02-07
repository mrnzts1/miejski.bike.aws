$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Map.feature");
formatter.feature({
  "line": 1,
  "name": "Map",
  "description": "",
  "id": "map",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#  PORTRAIT"
    }
  ],
  "line": 4,
  "name": "User does not accept app conditions",
  "description": "",
  "id": "map;user-does-not-accept-app-conditions",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User does not accept app conditions",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "App is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "MapSteps.userDoesNotAcceptAppConditions()"
});
formatter.result({
  "duration": 3340542778,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not find app apk at C:\\Users\\mrn\\Desktop\\bike apk\\miejski-bike-release-2.8.0-beta1.apk (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.83 seconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-U8AJIPE\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$errorHandler$0(JsonWireProtocolResponse.java:54)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:144)\r\n\tat config.AndroidDriverFactory.getCapabilities(AndroidDriverFactory.java:49)\r\n\tat config.AndroidDriverFactory.getDriver(AndroidDriverFactory.java:60)\r\n\tat page.Page.\u003cinit\u003e(Page.java:14)\r\n\tat page.MapView.\u003cinit\u003e(MapView.java:70)\r\n\tat steps.MapSteps.userDoesNotAcceptAppConditions(MapSteps.java:63)\r\n\tat ✽.Given User does not accept app conditions(Map.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MapSteps.appIsClosing()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "Accepting app conditions and allowing access to location",
  "description": "",
  "id": "map;accepting-app-conditions-and-allowing-access-to-location",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User accepts app conditions and allows access to location",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Map and all elements on the map are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MapSteps.acceptingAppConditions()"
});
formatter.result({
  "duration": 1169926956,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not find app apk at C:\\Users\\mrn\\Desktop\\bike apk\\miejski-bike-release-2.8.0-beta1.apk (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.15 seconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-U8AJIPE\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$errorHandler$0(JsonWireProtocolResponse.java:54)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:144)\r\n\tat config.AndroidDriverFactory.getCapabilities(AndroidDriverFactory.java:49)\r\n\tat config.AndroidDriverFactory.getDriver(AndroidDriverFactory.java:60)\r\n\tat page.Page.\u003cinit\u003e(Page.java:14)\r\n\tat page.MapView.\u003cinit\u003e(MapView.java:70)\r\n\tat steps.MapSteps.acceptingAppConditions(MapSteps.java:17)\r\n\tat ✽.Given User accepts app conditions and allows access to location(Map.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MapSteps.checkingAllTheElementsAreDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Checking if all positions il legend are displayed",
  "description": "",
  "id": "map;checking-if-all-positions-il-legend-are-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User accepts app conditions and allows access to location",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User clicks legend button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "All positions in legend are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MapSteps.acceptingAppConditions()"
});
formatter.result({
  "duration": 1880069215,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not find app apk at C:\\Users\\mrn\\Desktop\\bike apk\\miejski-bike-release-2.8.0-beta1.apk (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.86 seconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-U8AJIPE\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$errorHandler$0(JsonWireProtocolResponse.java:54)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:144)\r\n\tat config.AndroidDriverFactory.getCapabilities(AndroidDriverFactory.java:49)\r\n\tat config.AndroidDriverFactory.getDriver(AndroidDriverFactory.java:60)\r\n\tat page.Page.\u003cinit\u003e(Page.java:14)\r\n\tat page.MapView.\u003cinit\u003e(MapView.java:70)\r\n\tat steps.MapSteps.acceptingAppConditions(MapSteps.java:17)\r\n\tat ✽.Given User accepts app conditions and allows access to location(Map.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MapSteps.clickingLegendButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MapSteps.checkingIfAllElementsInLegendAreDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Checking if recording works properly",
  "description": "",
  "id": "map;checking-if-recording-works-properly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User accepts app conditions and allows access to location",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User clicks start recording button",
  "keyword": "When "
});
formatter.match({
  "location": "MapSteps.acceptingAppConditions()"
});
formatter.result({
  "duration": 1180303334,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not find app apk at C:\\Users\\mrn\\Desktop\\bike apk\\miejski-bike-release-2.8.0-beta1.apk (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 1.16 seconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-U8AJIPE\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.JsonWireProtocolResponse.lambda$errorHandler$0(JsonWireProtocolResponse.java:54)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:144)\r\n\tat config.AndroidDriverFactory.getCapabilities(AndroidDriverFactory.java:49)\r\n\tat config.AndroidDriverFactory.getDriver(AndroidDriverFactory.java:60)\r\n\tat page.Page.\u003cinit\u003e(Page.java:14)\r\n\tat page.MapView.\u003cinit\u003e(MapView.java:70)\r\n\tat steps.MapSteps.acceptingAppConditions(MapSteps.java:17)\r\n\tat ✽.Given User accepts app conditions and allows access to location(Map.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MapSteps.clickingStartRecordingButton()"
});
formatter.result({
  "status": "skipped"
});
});