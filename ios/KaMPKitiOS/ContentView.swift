import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text(shared.MR.strings().app_name.localized())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

extension ResourcesStringResource {
    func localized() -> String {
        return NSLocalizedString(resourceId, bundle: bundle, comment: "")
    }
}
