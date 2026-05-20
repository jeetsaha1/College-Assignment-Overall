import {
  Chart as ChartJS,
  BarElement,
  CategoryScale,
  LinearScale,
  Tooltip,
  Legend,
} from "chart.js";
import { Bar } from "react-chartjs-2";

ChartJS.register(CategoryScale, LinearScale, BarElement, Tooltip, Legend);

function MetricsChart({ cycleTime, leadTime, prThroughput, deploymentFrequency, bugRate }) {
  const data = {
    labels: [
      "Cycle Time",
      "Lead Time",
      "PR Throughput",
      "Deployments",
      "Bug Rate",
    ],
    datasets: [
      {
        label: "Metrics",
        data: [
          cycleTime,
          leadTime,
          prThroughput,
          deploymentFrequency,
          bugRate,
        ],
      },
    ],
  };

  return (
    <div style={{ width: "500px", marginTop: "20px" }}>
      <Bar data={data} />
    </div>
  );
}

export default MetricsChart;